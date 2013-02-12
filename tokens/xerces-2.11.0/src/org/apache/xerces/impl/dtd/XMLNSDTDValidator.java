package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
impl	TokenNameIdentifier
.	TokenNameDOT
dtd	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
impl	TokenNameIdentifier
.	TokenNameDOT
XMLErrorReporter	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
impl	TokenNameIdentifier
.	TokenNameDOT
msg	TokenNameIdentifier
.	TokenNameDOT
XMLMessageFormatter	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
XMLSymbols	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
xni	TokenNameIdentifier
.	TokenNameDOT
Augmentations	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
xni	TokenNameIdentifier
.	TokenNameDOT
NamespaceContext	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
xni	TokenNameIdentifier
.	TokenNameDOT
QName	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
xni	TokenNameIdentifier
.	TokenNameDOT
XMLAttributes	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
xni	TokenNameIdentifier
.	TokenNameDOT
XNIException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
XMLNSDTDValidator	TokenNameIdentifier
extends	TokenNameextends
XMLDTDValidator	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
final	TokenNamefinal
QName	TokenNameIdentifier
fAttributeQName	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
QName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
protected	TokenNameprotected
final	TokenNamefinal
void	TokenNamevoid
startNamespaceScope	TokenNameIdentifier
(	TokenNameLPAREN
QName	TokenNameIdentifier
element	TokenNameIdentifier
,	TokenNameCOMMA
XMLAttributes	TokenNameIdentifier
attributes	TokenNameIdentifier
,	TokenNameCOMMA
Augmentations	TokenNameIdentifier
augs	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
XNIException	TokenNameIdentifier
{	TokenNameLBRACE
fNamespaceContext	TokenNameIdentifier
.	TokenNameDOT
pushContext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
element	TokenNameIdentifier
.	TokenNameDOT
prefix	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
XMLSymbols	TokenNameIdentifier
.	TokenNameDOT
PREFIX_XMLNS	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fErrorReporter	TokenNameIdentifier
.	TokenNameDOT
reportError	TokenNameIdentifier
(	TokenNameLPAREN
XMLMessageFormatter	TokenNameIdentifier
.	TokenNameDOT
XMLNS_DOMAIN	TokenNameIdentifier
,	TokenNameCOMMA
"ElementXMLNSPrefix"	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
element	TokenNameIdentifier
.	TokenNameDOT
rawname	TokenNameIdentifier
}	TokenNameRBRACE
,	TokenNameCOMMA
XMLErrorReporter	TokenNameIdentifier
.	TokenNameDOT
SEVERITY_FATAL_ERROR	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
length	TokenNameIdentifier
=	TokenNameEQUAL
attributes	TokenNameIdentifier
.	TokenNameDOT
getLength	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
localpart	TokenNameIdentifier
=	TokenNameEQUAL
attributes	TokenNameIdentifier
.	TokenNameDOT
getLocalName	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
prefix	TokenNameIdentifier
=	TokenNameEQUAL
attributes	TokenNameIdentifier
.	TokenNameDOT
getPrefix	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
prefix	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
XMLSymbols	TokenNameIdentifier
.	TokenNameDOT
PREFIX_XMLNS	TokenNameIdentifier
||	TokenNameOR_OR
prefix	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
XMLSymbols	TokenNameIdentifier
.	TokenNameDOT
EMPTY_STRING	TokenNameIdentifier
&&	TokenNameAND_AND
localpart	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
XMLSymbols	TokenNameIdentifier
.	TokenNameDOT
PREFIX_XMLNS	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
uri	TokenNameIdentifier
=	TokenNameEQUAL
fSymbolTable	TokenNameIdentifier
.	TokenNameDOT
addSymbol	TokenNameIdentifier
(	TokenNameLPAREN
attributes	TokenNameIdentifier
.	TokenNameDOT
getValue	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
prefix	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
XMLSymbols	TokenNameIdentifier
.	TokenNameDOT
PREFIX_XMLNS	TokenNameIdentifier
&&	TokenNameAND_AND
localpart	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
XMLSymbols	TokenNameIdentifier
.	TokenNameDOT
PREFIX_XMLNS	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fErrorReporter	TokenNameIdentifier
.	TokenNameDOT
reportError	TokenNameIdentifier
(	TokenNameLPAREN
XMLMessageFormatter	TokenNameIdentifier
.	TokenNameDOT
XMLNS_DOMAIN	TokenNameIdentifier
,	TokenNameCOMMA
"CantBindXMLNS"	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
attributes	TokenNameIdentifier
.	TokenNameDOT
getQName	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
}	TokenNameRBRACE
,	TokenNameCOMMA
XMLErrorReporter	TokenNameIdentifier
.	TokenNameDOT
SEVERITY_FATAL_ERROR	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
uri	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
NamespaceContext	TokenNameIdentifier
.	TokenNameDOT
XMLNS_URI	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fErrorReporter	TokenNameIdentifier
.	TokenNameDOT
reportError	TokenNameIdentifier
(	TokenNameLPAREN
XMLMessageFormatter	TokenNameIdentifier
.	TokenNameDOT
XMLNS_DOMAIN	TokenNameIdentifier
,	TokenNameCOMMA
"CantBindXMLNS"	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
attributes	TokenNameIdentifier
.	TokenNameDOT
getQName	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
}	TokenNameRBRACE
,	TokenNameCOMMA
XMLErrorReporter	TokenNameIdentifier
.	TokenNameDOT
SEVERITY_FATAL_ERROR	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
localpart	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
XMLSymbols	TokenNameIdentifier
.	TokenNameDOT
PREFIX_XML	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
uri	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
NamespaceContext	TokenNameIdentifier
.	TokenNameDOT
XML_URI	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fErrorReporter	TokenNameIdentifier
.	TokenNameDOT
reportError	TokenNameIdentifier
(	TokenNameLPAREN
XMLMessageFormatter	TokenNameIdentifier
.	TokenNameDOT
XMLNS_DOMAIN	TokenNameIdentifier
,	TokenNameCOMMA
"CantBindXML"	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
attributes	TokenNameIdentifier
.	TokenNameDOT
getQName	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
}	TokenNameRBRACE
,	TokenNameCOMMA
XMLErrorReporter	TokenNameIdentifier
.	TokenNameDOT
SEVERITY_FATAL_ERROR	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
uri	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
NamespaceContext	TokenNameIdentifier
.	TokenNameDOT
XML_URI	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fErrorReporter	TokenNameIdentifier
.	TokenNameDOT
reportError	TokenNameIdentifier
(	TokenNameLPAREN
XMLMessageFormatter	TokenNameIdentifier
.	TokenNameDOT
XMLNS_DOMAIN	TokenNameIdentifier
,	TokenNameCOMMA
"CantBindXML"	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
attributes	TokenNameIdentifier
.	TokenNameDOT
getQName	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
}	TokenNameRBRACE
,	TokenNameCOMMA
XMLErrorReporter	TokenNameIdentifier
.	TokenNameDOT
SEVERITY_FATAL_ERROR	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
prefix	TokenNameIdentifier
=	TokenNameEQUAL
localpart	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
XMLSymbols	TokenNameIdentifier
.	TokenNameDOT
PREFIX_XMLNS	TokenNameIdentifier
?	TokenNameQUESTION
localpart	TokenNameIdentifier
:	TokenNameCOLON
XMLSymbols	TokenNameIdentifier
.	TokenNameDOT
EMPTY_STRING	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
uri	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
XMLSymbols	TokenNameIdentifier
.	TokenNameDOT
EMPTY_STRING	TokenNameIdentifier
&&	TokenNameAND_AND
localpart	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
XMLSymbols	TokenNameIdentifier
.	TokenNameDOT
PREFIX_XMLNS	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fErrorReporter	TokenNameIdentifier
.	TokenNameDOT
reportError	TokenNameIdentifier
(	TokenNameLPAREN
XMLMessageFormatter	TokenNameIdentifier
.	TokenNameDOT
XMLNS_DOMAIN	TokenNameIdentifier
,	TokenNameCOMMA
"EmptyPrefixedAttName"	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
attributes	TokenNameIdentifier
.	TokenNameDOT
getQName	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
}	TokenNameRBRACE
,	TokenNameCOMMA
XMLErrorReporter	TokenNameIdentifier
.	TokenNameDOT
SEVERITY_FATAL_ERROR	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
continue	TokenNamecontinue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
fNamespaceContext	TokenNameIdentifier
.	TokenNameDOT
declarePrefix	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
,	TokenNameCOMMA
uri	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
?	TokenNameQUESTION
uri	TokenNameIdentifier
:	TokenNameCOLON
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
String	TokenNameIdentifier
prefix	TokenNameIdentifier
=	TokenNameEQUAL
element	TokenNameIdentifier
.	TokenNameDOT
prefix	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
element	TokenNameIdentifier
.	TokenNameDOT
prefix	TokenNameIdentifier
:	TokenNameCOLON
XMLSymbols	TokenNameIdentifier
.	TokenNameDOT
EMPTY_STRING	TokenNameIdentifier
;	TokenNameSEMICOLON
element	TokenNameIdentifier
.	TokenNameDOT
uri	TokenNameIdentifier
=	TokenNameEQUAL
fNamespaceContext	TokenNameIdentifier
.	TokenNameDOT
getURI	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
element	TokenNameIdentifier
.	TokenNameDOT
prefix	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
element	TokenNameIdentifier
.	TokenNameDOT
uri	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
element	TokenNameIdentifier
.	TokenNameDOT
prefix	TokenNameIdentifier
=	TokenNameEQUAL
XMLSymbols	TokenNameIdentifier
.	TokenNameDOT
EMPTY_STRING	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
element	TokenNameIdentifier
.	TokenNameDOT
prefix	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
element	TokenNameIdentifier
.	TokenNameDOT
uri	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
fErrorReporter	TokenNameIdentifier
.	TokenNameDOT
reportError	TokenNameIdentifier
(	TokenNameLPAREN
XMLMessageFormatter	TokenNameIdentifier
.	TokenNameDOT
XMLNS_DOMAIN	TokenNameIdentifier
,	TokenNameCOMMA
"ElementPrefixUnbound"	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
element	TokenNameIdentifier
.	TokenNameDOT
prefix	TokenNameIdentifier
,	TokenNameCOMMA
element	TokenNameIdentifier
.	TokenNameDOT
rawname	TokenNameIdentifier
}	TokenNameRBRACE
,	TokenNameCOMMA
XMLErrorReporter	TokenNameIdentifier
.	TokenNameDOT
SEVERITY_FATAL_ERROR	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
attributes	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
,	TokenNameCOMMA
fAttributeQName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
aprefix	TokenNameIdentifier
=	TokenNameEQUAL
fAttributeQName	TokenNameIdentifier
.	TokenNameDOT
prefix	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
fAttributeQName	TokenNameIdentifier
.	TokenNameDOT
prefix	TokenNameIdentifier
:	TokenNameCOLON
XMLSymbols	TokenNameIdentifier
.	TokenNameDOT
EMPTY_STRING	TokenNameIdentifier
;	TokenNameSEMICOLON
String	TokenNameIdentifier
arawname	TokenNameIdentifier
=	TokenNameEQUAL
fAttributeQName	TokenNameIdentifier
.	TokenNameDOT
rawname	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
arawname	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
XMLSymbols	TokenNameIdentifier
.	TokenNameDOT
PREFIX_XMLNS	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fAttributeQName	TokenNameIdentifier
.	TokenNameDOT
uri	TokenNameIdentifier
=	TokenNameEQUAL
fNamespaceContext	TokenNameIdentifier
.	TokenNameDOT
getURI	TokenNameIdentifier
(	TokenNameLPAREN
XMLSymbols	TokenNameIdentifier
.	TokenNameDOT
PREFIX_XMLNS	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
attributes	TokenNameIdentifier
.	TokenNameDOT
setName	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
,	TokenNameCOMMA
fAttributeQName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
aprefix	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
XMLSymbols	TokenNameIdentifier
.	TokenNameDOT
EMPTY_STRING	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fAttributeQName	TokenNameIdentifier
.	TokenNameDOT
uri	TokenNameIdentifier
=	TokenNameEQUAL
fNamespaceContext	TokenNameIdentifier
.	TokenNameDOT
getURI	TokenNameIdentifier
(	TokenNameLPAREN
aprefix	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
fAttributeQName	TokenNameIdentifier
.	TokenNameDOT
uri	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
fErrorReporter	TokenNameIdentifier
.	TokenNameDOT
reportError	TokenNameIdentifier
(	TokenNameLPAREN
XMLMessageFormatter	TokenNameIdentifier
.	TokenNameDOT
XMLNS_DOMAIN	TokenNameIdentifier
,	TokenNameCOMMA
"AttributePrefixUnbound"	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
element	TokenNameIdentifier
.	TokenNameDOT
rawname	TokenNameIdentifier
,	TokenNameCOMMA
arawname	TokenNameIdentifier
,	TokenNameCOMMA
aprefix	TokenNameIdentifier
}	TokenNameRBRACE
,	TokenNameCOMMA
XMLErrorReporter	TokenNameIdentifier
.	TokenNameDOT
SEVERITY_FATAL_ERROR	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
attributes	TokenNameIdentifier
.	TokenNameDOT
setName	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
,	TokenNameCOMMA
fAttributeQName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
int	TokenNameint
attrCount	TokenNameIdentifier
=	TokenNameEQUAL
attributes	TokenNameIdentifier
.	TokenNameDOT
getLength	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
attrCount	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
auri	TokenNameIdentifier
=	TokenNameEQUAL
attributes	TokenNameIdentifier
.	TokenNameDOT
getURI	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
auri	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
auri	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
NamespaceContext	TokenNameIdentifier
.	TokenNameDOT
XMLNS_URI	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
continue	TokenNamecontinue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
String	TokenNameIdentifier
alocalpart	TokenNameIdentifier
=	TokenNameEQUAL
attributes	TokenNameIdentifier
.	TokenNameDOT
getLocalName	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
j	TokenNameIdentifier
=	TokenNameEQUAL
i	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
j	TokenNameIdentifier
<	TokenNameLESS
attrCount	TokenNameIdentifier
;	TokenNameSEMICOLON
j	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
blocalpart	TokenNameIdentifier
=	TokenNameEQUAL
attributes	TokenNameIdentifier
.	TokenNameDOT
getLocalName	TokenNameIdentifier
(	TokenNameLPAREN
j	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
buri	TokenNameIdentifier
=	TokenNameEQUAL
attributes	TokenNameIdentifier
.	TokenNameDOT
getURI	TokenNameIdentifier
(	TokenNameLPAREN
j	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
alocalpart	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
blocalpart	TokenNameIdentifier
&&	TokenNameAND_AND
auri	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
buri	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fErrorReporter	TokenNameIdentifier
.	TokenNameDOT
reportError	TokenNameIdentifier
(	TokenNameLPAREN
XMLMessageFormatter	TokenNameIdentifier
.	TokenNameDOT
XMLNS_DOMAIN	TokenNameIdentifier
,	TokenNameCOMMA
"AttributeNSNotUnique"	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
element	TokenNameIdentifier
.	TokenNameDOT
rawname	TokenNameIdentifier
,	TokenNameCOMMA
alocalpart	TokenNameIdentifier
,	TokenNameCOMMA
auri	TokenNameIdentifier
}	TokenNameRBRACE
,	TokenNameCOMMA
XMLErrorReporter	TokenNameIdentifier
.	TokenNameDOT
SEVERITY_FATAL_ERROR	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
endNamespaceScope	TokenNameIdentifier
(	TokenNameLPAREN
QName	TokenNameIdentifier
element	TokenNameIdentifier
,	TokenNameCOMMA
Augmentations	TokenNameIdentifier
augs	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
isEmpty	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
XNIException	TokenNameIdentifier
{	TokenNameLBRACE
String	TokenNameIdentifier
eprefix	TokenNameIdentifier
=	TokenNameEQUAL
element	TokenNameIdentifier
.	TokenNameDOT
prefix	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
element	TokenNameIdentifier
.	TokenNameDOT
prefix	TokenNameIdentifier
:	TokenNameCOLON
XMLSymbols	TokenNameIdentifier
.	TokenNameDOT
EMPTY_STRING	TokenNameIdentifier
;	TokenNameSEMICOLON
element	TokenNameIdentifier
.	TokenNameDOT
uri	TokenNameIdentifier
=	TokenNameEQUAL
fNamespaceContext	TokenNameIdentifier
.	TokenNameDOT
getURI	TokenNameIdentifier
(	TokenNameLPAREN
eprefix	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
element	TokenNameIdentifier
.	TokenNameDOT
uri	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
element	TokenNameIdentifier
.	TokenNameDOT
prefix	TokenNameIdentifier
=	TokenNameEQUAL
eprefix	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
fDocumentHandler	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
isEmpty	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fDocumentHandler	TokenNameIdentifier
.	TokenNameDOT
endElement	TokenNameIdentifier
(	TokenNameLPAREN
element	TokenNameIdentifier
,	TokenNameCOMMA
augs	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
fNamespaceContext	TokenNameIdentifier
.	TokenNameDOT
popContext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
