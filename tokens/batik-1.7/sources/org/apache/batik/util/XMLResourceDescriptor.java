package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
InputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Properties	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
MissingResourceException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
XMLResourceDescriptor	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
XML_PARSER_CLASS_NAME_KEY	TokenNameIdentifier
=	TokenNameEQUAL
"org.xml.sax.driver"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
CSS_PARSER_CLASS_NAME_KEY	TokenNameIdentifier
=	TokenNameEQUAL
"org.w3c.css.sac.driver"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
RESOURCES	TokenNameIdentifier
=	TokenNameEQUAL
"resources/XMLResourceDescriptor.properties"	TokenNameStringLiteral
;	TokenNameSEMICOLON
protected	TokenNameprotected
static	TokenNamestatic
Properties	TokenNameIdentifier
parserProps	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
protected	TokenNameprotected
static	TokenNamestatic
String	TokenNameIdentifier
xmlParserClassName	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
static	TokenNamestatic
String	TokenNameIdentifier
cssParserClassName	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
static	TokenNamestatic
synchronized	TokenNamesynchronized
Properties	TokenNameIdentifier
getParserProps	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
parserProps	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
parserProps	TokenNameIdentifier
;	TokenNameSEMICOLON
parserProps	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Properties	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
Class	TokenNameIdentifier
cls	TokenNameIdentifier
=	TokenNameEQUAL
XMLResourceDescriptor	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
;	TokenNameSEMICOLON
InputStream	TokenNameIdentifier
is	TokenNameIdentifier
=	TokenNameEQUAL
cls	TokenNameIdentifier
.	TokenNameDOT
getResourceAsStream	TokenNameIdentifier
(	TokenNameLPAREN
RESOURCES	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
parserProps	TokenNameIdentifier
.	TokenNameDOT
load	TokenNameIdentifier
(	TokenNameLPAREN
is	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
ioe	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
MissingResourceException	TokenNameIdentifier
(	TokenNameLPAREN
ioe	TokenNameIdentifier
.	TokenNameDOT
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
RESOURCES	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
parserProps	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
String	TokenNameIdentifier
getXMLParserClassName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
xmlParserClassName	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
xmlParserClassName	TokenNameIdentifier
=	TokenNameEQUAL
getParserProps	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
XML_PARSER_CLASS_NAME_KEY	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
xmlParserClassName	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
setXMLParserClassName	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
xmlParserClassName	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
XMLResourceDescriptor	TokenNameIdentifier
.	TokenNameDOT
xmlParserClassName	TokenNameIdentifier
=	TokenNameEQUAL
xmlParserClassName	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
String	TokenNameIdentifier
getCSSParserClassName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
cssParserClassName	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
cssParserClassName	TokenNameIdentifier
=	TokenNameEQUAL
getParserProps	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
CSS_PARSER_CLASS_NAME_KEY	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
cssParserClassName	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
setCSSParserClassName	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
cssParserClassName	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
XMLResourceDescriptor	TokenNameIdentifier
.	TokenNameDOT
cssParserClassName	TokenNameIdentifier
=	TokenNameEQUAL
cssParserClassName	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
