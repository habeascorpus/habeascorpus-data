package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xpath	TokenNameIdentifier
.	TokenNameDOT
operations	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xpath	TokenNameIdentifier
.	TokenNameDOT
XPathContext	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xpath	TokenNameIdentifier
.	TokenNameDOT
objects	TokenNameIdentifier
.	TokenNameDOT
XNumber	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xpath	TokenNameIdentifier
.	TokenNameDOT
objects	TokenNameIdentifier
.	TokenNameDOT
XObject	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
Mod	TokenNameIdentifier
extends	TokenNameextends
Operation	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
final	TokenNamefinal
long	TokenNamelong
serialVersionUID	TokenNameIdentifier
=	TokenNameEQUAL
5009471154238918201L	TokenNameLongLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
XObject	TokenNameIdentifier
operate	TokenNameIdentifier
(	TokenNameLPAREN
XObject	TokenNameIdentifier
left	TokenNameIdentifier
,	TokenNameCOMMA
XObject	TokenNameIdentifier
right	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
javax	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
transform	TokenNameIdentifier
.	TokenNameDOT
TransformerException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
XNumber	TokenNameIdentifier
(	TokenNameLPAREN
left	TokenNameIdentifier
.	TokenNameDOT
num	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
%	TokenNameREMAINDER
right	TokenNameIdentifier
.	TokenNameDOT
num	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
double	TokenNamedouble
num	TokenNameIdentifier
(	TokenNameLPAREN
XPathContext	TokenNameIdentifier
xctxt	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
javax	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
transform	TokenNameIdentifier
.	TokenNameDOT
TransformerException	TokenNameIdentifier
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
m_left	TokenNameIdentifier
.	TokenNameDOT
num	TokenNameIdentifier
(	TokenNameLPAREN
xctxt	TokenNameIdentifier
)	TokenNameRPAREN
%	TokenNameREMAINDER
m_right	TokenNameIdentifier
.	TokenNameDOT
num	TokenNameIdentifier
(	TokenNameLPAREN
xctxt	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
