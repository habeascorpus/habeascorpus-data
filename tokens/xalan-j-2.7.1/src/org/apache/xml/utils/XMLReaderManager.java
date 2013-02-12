package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Hashtable	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
parsers	TokenNameIdentifier
.	TokenNameDOT
FactoryConfigurationError	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
parsers	TokenNameIdentifier
.	TokenNameDOT
ParserConfigurationException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
parsers	TokenNameIdentifier
.	TokenNameDOT
SAXParserFactory	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
XMLReader	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
helpers	TokenNameIdentifier
.	TokenNameDOT
XMLReaderFactory	TokenNameIdentifier
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
XMLReaderManager	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
NAMESPACES_FEATURE	TokenNameIdentifier
=	TokenNameEQUAL
"http://xml.org/sax/features/namespaces"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
NAMESPACE_PREFIXES_FEATURE	TokenNameIdentifier
=	TokenNameEQUAL
"http://xml.org/sax/features/namespace-prefixes"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
XMLReaderManager	TokenNameIdentifier
m_singletonManager	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
XMLReaderManager	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
SAXParserFactory	TokenNameIdentifier
m_parserFactory	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
ThreadLocal	TokenNameIdentifier
m_readers	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
Hashtable	TokenNameIdentifier
m_inUse	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
XMLReaderManager	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
XMLReaderManager	TokenNameIdentifier
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
m_singletonManager	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
synchronized	TokenNamesynchronized
XMLReader	TokenNameIdentifier
getXMLReader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
SAXException	TokenNameIdentifier
{	TokenNameLBRACE
XMLReader	TokenNameIdentifier
reader	TokenNameIdentifier
;	TokenNameSEMICOLON
boolean	TokenNameboolean
readerInUse	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
m_readers	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
m_readers	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ThreadLocal	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
m_inUse	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
m_inUse	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Hashtable	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
reader	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
XMLReader	TokenNameIdentifier
)	TokenNameRPAREN
m_readers	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
boolean	TokenNameboolean
threadHasReader	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
reader	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
threadHasReader	TokenNameIdentifier
||	TokenNameOR_OR
m_inUse	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
Boolean	TokenNameIdentifier
.	TokenNameDOT
TRUE	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
reader	TokenNameIdentifier
=	TokenNameEQUAL
XMLReaderFactory	TokenNameIdentifier
.	TokenNameDOT
createXMLReader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
m_parserFactory	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
m_parserFactory	TokenNameIdentifier
=	TokenNameEQUAL
SAXParserFactory	TokenNameIdentifier
.	TokenNameDOT
newInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_parserFactory	TokenNameIdentifier
.	TokenNameDOT
setNamespaceAware	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
reader	TokenNameIdentifier
=	TokenNameEQUAL
m_parserFactory	TokenNameIdentifier
.	TokenNameDOT
newSAXParser	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getXMLReader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
ParserConfigurationException	TokenNameIdentifier
pce	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
pce	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
try	TokenNametry
{	TokenNameLBRACE
reader	TokenNameIdentifier
.	TokenNameDOT
setFeature	TokenNameIdentifier
(	TokenNameLPAREN
NAMESPACES_FEATURE	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
reader	TokenNameIdentifier
.	TokenNameDOT
setFeature	TokenNameIdentifier
(	TokenNameLPAREN
NAMESPACE_PREFIXES_FEATURE	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
SAXException	TokenNameIdentifier
se	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
ParserConfigurationException	TokenNameIdentifier
ex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
SAXException	TokenNameIdentifier
(	TokenNameLPAREN
ex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
FactoryConfigurationError	TokenNameIdentifier
ex1	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
SAXException	TokenNameIdentifier
(	TokenNameLPAREN
ex1	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
NoSuchMethodError	TokenNameIdentifier
ex2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
AbstractMethodError	TokenNameIdentifier
ame	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
threadHasReader	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
m_readers	TokenNameIdentifier
.	TokenNameDOT
set	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_inUse	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
,	TokenNameCOMMA
Boolean	TokenNameIdentifier
.	TokenNameDOT
TRUE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
m_inUse	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
,	TokenNameCOMMA
Boolean	TokenNameIdentifier
.	TokenNameDOT
TRUE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
reader	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
synchronized	TokenNamesynchronized
void	TokenNamevoid
releaseXMLReader	TokenNameIdentifier
(	TokenNameLPAREN
XMLReader	TokenNameIdentifier
reader	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
m_readers	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
reader	TokenNameIdentifier
&&	TokenNameAND_AND
reader	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
m_inUse	TokenNameIdentifier
.	TokenNameDOT
remove	TokenNameIdentifier
(	TokenNameLPAREN
reader	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE