package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
dom3	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
DOMError	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
DOMLocator	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
class	TokenNameclass
DOMErrorImpl	TokenNameIdentifier
implements	TokenNameimplements
DOMError	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
short	TokenNameshort
fSeverity	TokenNameIdentifier
=	TokenNameEQUAL
DOMError	TokenNameIdentifier
.	TokenNameDOT
SEVERITY_WARNING	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
fMessage	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
fType	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
Exception	TokenNameIdentifier
fException	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
private	TokenNameprivate
Object	TokenNameIdentifier
fRelatedData	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
DOMLocatorImpl	TokenNameIdentifier
fLocation	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DOMLocatorImpl	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
DOMErrorImpl	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
DOMErrorImpl	TokenNameIdentifier
(	TokenNameLPAREN
short	TokenNameshort
severity	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
message	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
type	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fSeverity	TokenNameIdentifier
=	TokenNameEQUAL
severity	TokenNameIdentifier
;	TokenNameSEMICOLON
fMessage	TokenNameIdentifier
=	TokenNameEQUAL
message	TokenNameIdentifier
;	TokenNameSEMICOLON
fType	TokenNameIdentifier
=	TokenNameEQUAL
type	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
DOMErrorImpl	TokenNameIdentifier
(	TokenNameLPAREN
short	TokenNameshort
severity	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
message	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
type	TokenNameIdentifier
,	TokenNameCOMMA
Exception	TokenNameIdentifier
exception	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fSeverity	TokenNameIdentifier
=	TokenNameEQUAL
severity	TokenNameIdentifier
;	TokenNameSEMICOLON
fMessage	TokenNameIdentifier
=	TokenNameEQUAL
message	TokenNameIdentifier
;	TokenNameSEMICOLON
fType	TokenNameIdentifier
=	TokenNameEQUAL
type	TokenNameIdentifier
;	TokenNameSEMICOLON
fException	TokenNameIdentifier
=	TokenNameEQUAL
exception	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
DOMErrorImpl	TokenNameIdentifier
(	TokenNameLPAREN
short	TokenNameshort
severity	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
message	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
type	TokenNameIdentifier
,	TokenNameCOMMA
Exception	TokenNameIdentifier
exception	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
relatedData	TokenNameIdentifier
,	TokenNameCOMMA
DOMLocatorImpl	TokenNameIdentifier
location	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fSeverity	TokenNameIdentifier
=	TokenNameEQUAL
severity	TokenNameIdentifier
;	TokenNameSEMICOLON
fMessage	TokenNameIdentifier
=	TokenNameEQUAL
message	TokenNameIdentifier
;	TokenNameSEMICOLON
fType	TokenNameIdentifier
=	TokenNameEQUAL
type	TokenNameIdentifier
;	TokenNameSEMICOLON
fException	TokenNameIdentifier
=	TokenNameEQUAL
exception	TokenNameIdentifier
;	TokenNameSEMICOLON
fRelatedData	TokenNameIdentifier
=	TokenNameEQUAL
relatedData	TokenNameIdentifier
;	TokenNameSEMICOLON
fLocation	TokenNameIdentifier
=	TokenNameEQUAL
location	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
short	TokenNameshort
getSeverity	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
fSeverity	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
fMessage	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
DOMLocator	TokenNameIdentifier
getLocation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
fLocation	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Object	TokenNameIdentifier
getRelatedException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
fException	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
fType	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Object	TokenNameIdentifier
getRelatedData	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
fRelatedData	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
reset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
fSeverity	TokenNameIdentifier
=	TokenNameEQUAL
DOMError	TokenNameIdentifier
.	TokenNameDOT
SEVERITY_WARNING	TokenNameIdentifier
;	TokenNameSEMICOLON
fException	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
fMessage	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
fType	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
fRelatedData	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
fLocation	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
