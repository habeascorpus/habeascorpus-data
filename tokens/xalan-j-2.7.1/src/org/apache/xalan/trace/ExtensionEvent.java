package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xalan	TokenNameIdentifier
.	TokenNameDOT
trace	TokenNameIdentifier
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
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
lang	TokenNameIdentifier
.	TokenNameDOT
reflect	TokenNameIdentifier
.	TokenNameDOT
Method	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xalan	TokenNameIdentifier
.	TokenNameDOT
transformer	TokenNameIdentifier
.	TokenNameDOT
TransformerImpl	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
ExtensionEvent	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
DEFAULT_CONSTRUCTOR	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
METHOD	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
CONSTRUCTOR	TokenNameIdentifier
=	TokenNameEQUAL
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
int	TokenNameint
m_callType	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
TransformerImpl	TokenNameIdentifier
m_transformer	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
Object	TokenNameIdentifier
m_method	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
Object	TokenNameIdentifier
m_instance	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
m_arguments	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
ExtensionEvent	TokenNameIdentifier
(	TokenNameLPAREN
TransformerImpl	TokenNameIdentifier
transformer	TokenNameIdentifier
,	TokenNameCOMMA
Method	TokenNameIdentifier
method	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
instance	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
arguments	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
m_transformer	TokenNameIdentifier
=	TokenNameEQUAL
transformer	TokenNameIdentifier
;	TokenNameSEMICOLON
m_method	TokenNameIdentifier
=	TokenNameEQUAL
method	TokenNameIdentifier
;	TokenNameSEMICOLON
m_instance	TokenNameIdentifier
=	TokenNameEQUAL
instance	TokenNameIdentifier
;	TokenNameSEMICOLON
m_arguments	TokenNameIdentifier
=	TokenNameEQUAL
arguments	TokenNameIdentifier
;	TokenNameSEMICOLON
m_callType	TokenNameIdentifier
=	TokenNameEQUAL
METHOD	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ExtensionEvent	TokenNameIdentifier
(	TokenNameLPAREN
TransformerImpl	TokenNameIdentifier
transformer	TokenNameIdentifier
,	TokenNameCOMMA
Constructor	TokenNameIdentifier
constructor	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
arguments	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
m_transformer	TokenNameIdentifier
=	TokenNameEQUAL
transformer	TokenNameIdentifier
;	TokenNameSEMICOLON
m_instance	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
m_arguments	TokenNameIdentifier
=	TokenNameEQUAL
arguments	TokenNameIdentifier
;	TokenNameSEMICOLON
m_method	TokenNameIdentifier
=	TokenNameEQUAL
constructor	TokenNameIdentifier
;	TokenNameSEMICOLON
m_callType	TokenNameIdentifier
=	TokenNameEQUAL
CONSTRUCTOR	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ExtensionEvent	TokenNameIdentifier
(	TokenNameLPAREN
TransformerImpl	TokenNameIdentifier
transformer	TokenNameIdentifier
,	TokenNameCOMMA
Class	TokenNameIdentifier
clazz	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
m_transformer	TokenNameIdentifier
=	TokenNameEQUAL
transformer	TokenNameIdentifier
;	TokenNameSEMICOLON
m_instance	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
m_arguments	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
m_method	TokenNameIdentifier
=	TokenNameEQUAL
clazz	TokenNameIdentifier
;	TokenNameSEMICOLON
m_callType	TokenNameIdentifier
=	TokenNameEQUAL
DEFAULT_CONSTRUCTOR	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE