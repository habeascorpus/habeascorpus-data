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
res	TokenNameIdentifier
.	TokenNameDOT
XSLTErrorResources	TokenNameIdentifier
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
NamespaceAlias	TokenNameIdentifier
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
class	TokenNameclass
ProcessorNamespaceAlias	TokenNameIdentifier
extends	TokenNameextends
XSLTElementProcessor	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
final	TokenNamefinal
long	TokenNamelong
serialVersionUID	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
6309867839007018964L	TokenNameLongLiteral
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
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
SAXException	TokenNameIdentifier
{	TokenNameLBRACE
final	TokenNamefinal
String	TokenNameIdentifier
resultNS	TokenNameIdentifier
;	TokenNameSEMICOLON
NamespaceAlias	TokenNameIdentifier
na	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
NamespaceAlias	TokenNameIdentifier
(	TokenNameLPAREN
handler	TokenNameIdentifier
.	TokenNameDOT
nextUid	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setPropertiesFromAttributes	TokenNameIdentifier
(	TokenNameLPAREN
handler	TokenNameIdentifier
,	TokenNameCOMMA
rawName	TokenNameIdentifier
,	TokenNameCOMMA
attributes	TokenNameIdentifier
,	TokenNameCOMMA
na	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
prefix	TokenNameIdentifier
=	TokenNameEQUAL
na	TokenNameIdentifier
.	TokenNameDOT
getStylesheetPrefix	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
prefix	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"#default"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
prefix	TokenNameIdentifier
=	TokenNameEQUAL
""	TokenNameStringLiteral
;	TokenNameSEMICOLON
na	TokenNameIdentifier
.	TokenNameDOT
setStylesheetPrefix	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
String	TokenNameIdentifier
stylesheetNS	TokenNameIdentifier
=	TokenNameEQUAL
handler	TokenNameIdentifier
.	TokenNameDOT
getNamespaceForPrefix	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
na	TokenNameIdentifier
.	TokenNameDOT
setStylesheetNamespace	TokenNameIdentifier
(	TokenNameLPAREN
stylesheetNS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
prefix	TokenNameIdentifier
=	TokenNameEQUAL
na	TokenNameIdentifier
.	TokenNameDOT
getResultPrefix	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
prefix	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"#default"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
prefix	TokenNameIdentifier
=	TokenNameEQUAL
""	TokenNameStringLiteral
;	TokenNameSEMICOLON
na	TokenNameIdentifier
.	TokenNameDOT
setResultPrefix	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
resultNS	TokenNameIdentifier
=	TokenNameEQUAL
handler	TokenNameIdentifier
.	TokenNameDOT
getNamespaceForPrefix	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
null	TokenNamenull
==	TokenNameEQUAL_EQUAL
resultNS	TokenNameIdentifier
)	TokenNameRPAREN
handler	TokenNameIdentifier
.	TokenNameDOT
error	TokenNameIdentifier
(	TokenNameLPAREN
XSLTErrorResources	TokenNameIdentifier
.	TokenNameDOT
ER_INVALID_NAMESPACE_URI_VALUE_FOR_RESULT_PREFIX_FOR_DEFAULT	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
resultNS	TokenNameIdentifier
=	TokenNameEQUAL
handler	TokenNameIdentifier
.	TokenNameDOT
getNamespaceForPrefix	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
null	TokenNamenull
==	TokenNameEQUAL_EQUAL
resultNS	TokenNameIdentifier
)	TokenNameRPAREN
handler	TokenNameIdentifier
.	TokenNameDOT
error	TokenNameIdentifier
(	TokenNameLPAREN
XSLTErrorResources	TokenNameIdentifier
.	TokenNameDOT
ER_INVALID_NAMESPACE_URI_VALUE_FOR_RESULT_PREFIX	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
prefix	TokenNameIdentifier
}	TokenNameRBRACE
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
na	TokenNameIdentifier
.	TokenNameDOT
setResultNamespace	TokenNameIdentifier
(	TokenNameLPAREN
resultNS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
handler	TokenNameIdentifier
.	TokenNameDOT
getStylesheet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setNamespaceAlias	TokenNameIdentifier
(	TokenNameLPAREN
na	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
handler	TokenNameIdentifier
.	TokenNameDOT
getStylesheet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
appendChild	TokenNameIdentifier
(	TokenNameLPAREN
na	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
