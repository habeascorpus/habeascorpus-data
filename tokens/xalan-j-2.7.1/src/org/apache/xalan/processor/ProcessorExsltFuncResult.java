package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xalan	TokenNameIdentifier
.	TokenNameDOT
processor	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xalan	TokenNameIdentifier
.	TokenNameDOT
templates	TokenNameIdentifier
.	TokenNameDOT
ElemExsltFuncResult	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xalan	TokenNameIdentifier
.	TokenNameDOT
templates	TokenNameIdentifier
.	TokenNameDOT
ElemExsltFunction	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xalan	TokenNameIdentifier
.	TokenNameDOT
templates	TokenNameIdentifier
.	TokenNameDOT
ElemParam	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xalan	TokenNameIdentifier
.	TokenNameDOT
templates	TokenNameIdentifier
.	TokenNameDOT
ElemTemplateElement	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xalan	TokenNameIdentifier
.	TokenNameDOT
templates	TokenNameIdentifier
.	TokenNameDOT
ElemVariable	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
Attributes	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
SAXException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
ProcessorExsltFuncResult	TokenNameIdentifier
extends	TokenNameextends
ProcessorTemplateElem	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
final	TokenNamefinal
long	TokenNamelong
serialVersionUID	TokenNameIdentifier
=	TokenNameEQUAL
6451230911473482423L	TokenNameLongLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
startElement	TokenNameIdentifier
(	TokenNameLPAREN
StylesheetHandler	TokenNameIdentifier
handler	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
uri	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
localName	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
rawName	TokenNameIdentifier
,	TokenNameCOMMA
Attributes	TokenNameIdentifier
attributes	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
SAXException	TokenNameIdentifier
{	TokenNameLBRACE
String	TokenNameIdentifier
msg	TokenNameIdentifier
=	TokenNameEQUAL
""	TokenNameStringLiteral
;	TokenNameSEMICOLON
super	TokenNamesuper
.	TokenNameDOT
startElement	TokenNameIdentifier
(	TokenNameLPAREN
handler	TokenNameIdentifier
,	TokenNameCOMMA
uri	TokenNameIdentifier
,	TokenNameCOMMA
localName	TokenNameIdentifier
,	TokenNameCOMMA
rawName	TokenNameIdentifier
,	TokenNameCOMMA
attributes	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ElemTemplateElement	TokenNameIdentifier
ancestor	TokenNameIdentifier
=	TokenNameEQUAL
handler	TokenNameIdentifier
.	TokenNameDOT
getElemTemplateElement	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getParentElem	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
ancestor	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
!	TokenNameNOT
(	TokenNameLPAREN
ancestor	TokenNameIdentifier
instanceof	TokenNameinstanceof
ElemExsltFunction	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
ancestor	TokenNameIdentifier
instanceof	TokenNameinstanceof
ElemVariable	TokenNameIdentifier
||	TokenNameOR_OR
ancestor	TokenNameIdentifier
instanceof	TokenNameinstanceof
ElemParam	TokenNameIdentifier
||	TokenNameOR_OR
ancestor	TokenNameIdentifier
instanceof	TokenNameinstanceof
ElemExsltFuncResult	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
msg	TokenNameIdentifier
=	TokenNameEQUAL
"func:result cannot appear within a variable, parameter, or another func:result."	TokenNameStringLiteral
;	TokenNameSEMICOLON
handler	TokenNameIdentifier
.	TokenNameDOT
error	TokenNameIdentifier
(	TokenNameLPAREN
msg	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
SAXException	TokenNameIdentifier
(	TokenNameLPAREN
msg	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
ancestor	TokenNameIdentifier
=	TokenNameEQUAL
ancestor	TokenNameIdentifier
.	TokenNameDOT
getParentElem	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
ancestor	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
msg	TokenNameIdentifier
=	TokenNameEQUAL
"func:result must appear in a func:function element"	TokenNameStringLiteral
;	TokenNameSEMICOLON
handler	TokenNameIdentifier
.	TokenNameDOT
error	TokenNameIdentifier
(	TokenNameLPAREN
msg	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
SAXException	TokenNameIdentifier
(	TokenNameLPAREN
msg	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
