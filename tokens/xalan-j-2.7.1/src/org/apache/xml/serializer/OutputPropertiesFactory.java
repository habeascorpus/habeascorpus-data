package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
BufferedInputStream	TokenNameIdentifier
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
io	TokenNameIdentifier
.	TokenNameDOT
InputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
security	TokenNameIdentifier
.	TokenNameDOT
AccessController	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
security	TokenNameIdentifier
.	TokenNameDOT
PrivilegedAction	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Enumeration	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Properties	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
transform	TokenNameIdentifier
.	TokenNameDOT
OutputKeys	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
.	TokenNameDOT
MsgKey	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
.	TokenNameDOT
Utils	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
.	TokenNameDOT
WrappedRuntimeException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
class	TokenNameclass
OutputPropertiesFactory	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
S_BUILTIN_EXTENSIONS_URL	TokenNameIdentifier
=	TokenNameEQUAL
"http://xml.apache.org/xalan"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
S_BUILTIN_OLD_EXTENSIONS_URL	TokenNameIdentifier
=	TokenNameEQUAL
"http://xml.apache.org/xslt"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
S_BUILTIN_EXTENSIONS_UNIVERSAL	TokenNameIdentifier
=	TokenNameEQUAL
"{"	TokenNameStringLiteral
+	TokenNamePLUS
S_BUILTIN_EXTENSIONS_URL	TokenNameIdentifier
+	TokenNamePLUS
"}"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
S_KEY_INDENT_AMOUNT	TokenNameIdentifier
=	TokenNameEQUAL
S_BUILTIN_EXTENSIONS_UNIVERSAL	TokenNameIdentifier
+	TokenNamePLUS
"indent-amount"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
S_KEY_LINE_SEPARATOR	TokenNameIdentifier
=	TokenNameEQUAL
S_BUILTIN_EXTENSIONS_UNIVERSAL	TokenNameIdentifier
+	TokenNamePLUS
"line-separator"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
S_KEY_CONTENT_HANDLER	TokenNameIdentifier
=	TokenNameEQUAL
S_BUILTIN_EXTENSIONS_UNIVERSAL	TokenNameIdentifier
+	TokenNamePLUS
"content-handler"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
S_KEY_ENTITIES	TokenNameIdentifier
=	TokenNameEQUAL
S_BUILTIN_EXTENSIONS_UNIVERSAL	TokenNameIdentifier
+	TokenNamePLUS
"entities"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
S_USE_URL_ESCAPING	TokenNameIdentifier
=	TokenNameEQUAL
S_BUILTIN_EXTENSIONS_UNIVERSAL	TokenNameIdentifier
+	TokenNamePLUS
"use-url-escaping"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
S_OMIT_META_TAG	TokenNameIdentifier
=	TokenNameEQUAL
S_BUILTIN_EXTENSIONS_UNIVERSAL	TokenNameIdentifier
+	TokenNamePLUS
"omit-meta-tag"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
S_BUILTIN_OLD_EXTENSIONS_UNIVERSAL	TokenNameIdentifier
=	TokenNameEQUAL
"{"	TokenNameStringLiteral
+	TokenNamePLUS
S_BUILTIN_OLD_EXTENSIONS_URL	TokenNameIdentifier
+	TokenNamePLUS
"}"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
S_BUILTIN_OLD_EXTENSIONS_UNIVERSAL_LEN	TokenNameIdentifier
=	TokenNameEQUAL
S_BUILTIN_OLD_EXTENSIONS_UNIVERSAL	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
S_XSLT_PREFIX	TokenNameIdentifier
=	TokenNameEQUAL
"xslt.output."	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
S_XSLT_PREFIX_LEN	TokenNameIdentifier
=	TokenNameEQUAL
S_XSLT_PREFIX	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
S_XALAN_PREFIX	TokenNameIdentifier
=	TokenNameEQUAL
"org.apache.xslt."	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
S_XALAN_PREFIX_LEN	TokenNameIdentifier
=	TokenNameEQUAL
S_XALAN_PREFIX	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
Integer	TokenNameIdentifier
m_synch_object	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Integer	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
PROP_DIR	TokenNameIdentifier
=	TokenNameEQUAL
SerializerBase	TokenNameIdentifier
.	TokenNameDOT
PKG_PATH	TokenNameIdentifier
+	TokenNamePLUS
'/'	TokenNameCharacterLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
PROP_FILE_XML	TokenNameIdentifier
=	TokenNameEQUAL
"output_xml.properties"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
PROP_FILE_TEXT	TokenNameIdentifier
=	TokenNameEQUAL
"output_text.properties"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
PROP_FILE_HTML	TokenNameIdentifier
=	TokenNameEQUAL
"output_html.properties"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
PROP_FILE_UNKNOWN	TokenNameIdentifier
=	TokenNameEQUAL
"output_unknown.properties"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
Properties	TokenNameIdentifier
m_xml_properties	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
Properties	TokenNameIdentifier
m_html_properties	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
Properties	TokenNameIdentifier
m_text_properties	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
Properties	TokenNameIdentifier
m_unknown_properties	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
Class	TokenNameIdentifier
ACCESS_CONTROLLER_CLASS	TokenNameIdentifier
=	TokenNameEQUAL
findAccessControllerClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
Class	TokenNameIdentifier
findAccessControllerClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
return	TokenNamereturn
Class	TokenNameIdentifier
.	TokenNameDOT
forName	TokenNameIdentifier
(	TokenNameLPAREN
"java.security.AccessController"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
static	TokenNamestatic
public	TokenNamepublic
final	TokenNamefinal
Properties	TokenNameIdentifier
getDefaultMethodProperties	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
method	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
fileName	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
Properties	TokenNameIdentifier
defaultProperties	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
synchronized	TokenNamesynchronized
(	TokenNameLPAREN
m_synch_object	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
null	TokenNamenull
==	TokenNameEQUAL_EQUAL
m_xml_properties	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fileName	TokenNameIdentifier
=	TokenNameEQUAL
PROP_FILE_XML	TokenNameIdentifier
;	TokenNameSEMICOLON
m_xml_properties	TokenNameIdentifier
=	TokenNameEQUAL
loadPropertiesFile	TokenNameIdentifier
(	TokenNameLPAREN
fileName	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
method	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
Method	TokenNameIdentifier
.	TokenNameDOT
XML	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
defaultProperties	TokenNameIdentifier
=	TokenNameEQUAL
m_xml_properties	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
method	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
Method	TokenNameIdentifier
.	TokenNameDOT
HTML	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
null	TokenNamenull
==	TokenNameEQUAL_EQUAL
m_html_properties	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fileName	TokenNameIdentifier
=	TokenNameEQUAL
PROP_FILE_HTML	TokenNameIdentifier
;	TokenNameSEMICOLON
m_html_properties	TokenNameIdentifier
=	TokenNameEQUAL
loadPropertiesFile	TokenNameIdentifier
(	TokenNameLPAREN
fileName	TokenNameIdentifier
,	TokenNameCOMMA
m_xml_properties	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
defaultProperties	TokenNameIdentifier
=	TokenNameEQUAL
m_html_properties	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
method	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
Method	TokenNameIdentifier
.	TokenNameDOT
TEXT	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
null	TokenNamenull
==	TokenNameEQUAL_EQUAL
m_text_properties	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fileName	TokenNameIdentifier
=	TokenNameEQUAL
PROP_FILE_TEXT	TokenNameIdentifier
;	TokenNameSEMICOLON
m_text_properties	TokenNameIdentifier
=	TokenNameEQUAL
loadPropertiesFile	TokenNameIdentifier
(	TokenNameLPAREN
fileName	TokenNameIdentifier
,	TokenNameCOMMA
m_xml_properties	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
null	TokenNamenull
==	TokenNameEQUAL_EQUAL
m_text_properties	TokenNameIdentifier
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
OutputKeys	TokenNameIdentifier
.	TokenNameDOT
ENCODING	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
mimeEncoding	TokenNameIdentifier
=	TokenNameEQUAL
Encodings	TokenNameIdentifier
.	TokenNameDOT
getMimeEncoding	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_text_properties	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
OutputKeys	TokenNameIdentifier
.	TokenNameDOT
ENCODING	TokenNameIdentifier
,	TokenNameCOMMA
mimeEncoding	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
defaultProperties	TokenNameIdentifier
=	TokenNameEQUAL
m_text_properties	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
method	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
Method	TokenNameIdentifier
.	TokenNameDOT
UNKNOWN	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
null	TokenNamenull
==	TokenNameEQUAL_EQUAL
m_unknown_properties	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fileName	TokenNameIdentifier
=	TokenNameEQUAL
PROP_FILE_UNKNOWN	TokenNameIdentifier
;	TokenNameSEMICOLON
m_unknown_properties	TokenNameIdentifier
=	TokenNameEQUAL
loadPropertiesFile	TokenNameIdentifier
(	TokenNameLPAREN
fileName	TokenNameIdentifier
,	TokenNameCOMMA
m_xml_properties	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
defaultProperties	TokenNameIdentifier
=	TokenNameEQUAL
m_unknown_properties	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
defaultProperties	TokenNameIdentifier
=	TokenNameEQUAL
m_xml_properties	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
ioe	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
WrappedRuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
Utils	TokenNameIdentifier
.	TokenNameDOT
messages	TokenNameIdentifier
.	TokenNameDOT
createMessage	TokenNameIdentifier
(	TokenNameLPAREN
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_COULD_NOT_LOAD_METHOD_PROPERTY	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
fileName	TokenNameIdentifier
,	TokenNameCOMMA
method	TokenNameIdentifier
}	TokenNameRBRACE
)	TokenNameRPAREN
,	TokenNameCOMMA
ioe	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
new	TokenNamenew
Properties	TokenNameIdentifier
(	TokenNameLPAREN
defaultProperties	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
static	TokenNamestatic
private	TokenNameprivate
Properties	TokenNameIdentifier
loadPropertiesFile	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
String	TokenNameIdentifier
resourceName	TokenNameIdentifier
,	TokenNameCOMMA
Properties	TokenNameIdentifier
defaults	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
Properties	TokenNameIdentifier
props	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Properties	TokenNameIdentifier
(	TokenNameLPAREN
defaults	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
InputStream	TokenNameIdentifier
is	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
BufferedInputStream	TokenNameIdentifier
bis	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
ACCESS_CONTROLLER_CLASS	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
is	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
InputStream	TokenNameIdentifier
)	TokenNameRPAREN
AccessController	TokenNameIdentifier
.	TokenNameDOT
doPrivileged	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
PrivilegedAction	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
public	TokenNamepublic
Object	TokenNameIdentifier
run	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
OutputPropertiesFactory	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
.	TokenNameDOT
getResourceAsStream	TokenNameIdentifier
(	TokenNameLPAREN
resourceName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
is	TokenNameIdentifier
=	TokenNameEQUAL
OutputPropertiesFactory	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
.	TokenNameDOT
getResourceAsStream	TokenNameIdentifier
(	TokenNameLPAREN
resourceName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
bis	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BufferedInputStream	TokenNameIdentifier
(	TokenNameLPAREN
is	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
props	TokenNameIdentifier
.	TokenNameDOT
load	TokenNameIdentifier
(	TokenNameLPAREN
bis	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
ioe	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
defaults	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
ioe	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
WrappedRuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
Utils	TokenNameIdentifier
.	TokenNameDOT
messages	TokenNameIdentifier
.	TokenNameDOT
createMessage	TokenNameIdentifier
(	TokenNameLPAREN
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_COULD_NOT_LOAD_RESOURCE	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
resourceName	TokenNameIdentifier
}	TokenNameRBRACE
)	TokenNameRPAREN
,	TokenNameCOMMA
ioe	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
SecurityException	TokenNameIdentifier
se	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
defaults	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
se	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
WrappedRuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
Utils	TokenNameIdentifier
.	TokenNameDOT
messages	TokenNameIdentifier
.	TokenNameDOT
createMessage	TokenNameIdentifier
(	TokenNameLPAREN
MsgKey	TokenNameIdentifier
.	TokenNameDOT
ER_COULD_NOT_LOAD_RESOURCE	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
resourceName	TokenNameIdentifier
}	TokenNameRBRACE
)	TokenNameRPAREN
,	TokenNameCOMMA
se	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
bis	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
bis	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
is	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
is	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
Enumeration	TokenNameIdentifier
keys	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
Properties	TokenNameIdentifier
)	TokenNameRPAREN
props	TokenNameIdentifier
.	TokenNameDOT
clone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
keys	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
keys	TokenNameIdentifier
.	TokenNameDOT
hasMoreElements	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
key	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
String	TokenNameIdentifier
)	TokenNameRPAREN
keys	TokenNameIdentifier
.	TokenNameDOT
nextElement	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
value	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
value	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
SecurityException	TokenNameIdentifier
se	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
value	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
value	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
String	TokenNameIdentifier
)	TokenNameRPAREN
props	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
newKey	TokenNameIdentifier
=	TokenNameEQUAL
fixupPropertyString	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
,	TokenNameCOMMA
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
newValue	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
newValue	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
newKey	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
SecurityException	TokenNameIdentifier
se	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
newValue	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
newValue	TokenNameIdentifier
=	TokenNameEQUAL
fixupPropertyString	TokenNameIdentifier
(	TokenNameLPAREN
value	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
newValue	TokenNameIdentifier
=	TokenNameEQUAL
fixupPropertyString	TokenNameIdentifier
(	TokenNameLPAREN
newValue	TokenNameIdentifier
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
key	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
newKey	TokenNameIdentifier
||	TokenNameOR_OR
value	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
newValue	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
props	TokenNameIdentifier
.	TokenNameDOT
remove	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
props	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
newKey	TokenNameIdentifier
,	TokenNameCOMMA
newValue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
props	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
static	TokenNamestatic
private	TokenNameprivate
String	TokenNameIdentifier
fixupPropertyString	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
s	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
doClipping	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
index	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
doClipping	TokenNameIdentifier
&&	TokenNameAND_AND
s	TokenNameIdentifier
.	TokenNameDOT
startsWith	TokenNameIdentifier
(	TokenNameLPAREN
S_XSLT_PREFIX	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
s	TokenNameIdentifier
=	TokenNameEQUAL
s	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
S_XSLT_PREFIX_LEN	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
s	TokenNameIdentifier
.	TokenNameDOT
startsWith	TokenNameIdentifier
(	TokenNameLPAREN
S_XALAN_PREFIX	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
s	TokenNameIdentifier
=	TokenNameEQUAL
S_BUILTIN_EXTENSIONS_UNIVERSAL	TokenNameIdentifier
+	TokenNamePLUS
s	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
S_XALAN_PREFIX_LEN	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
index	TokenNameIdentifier
=	TokenNameEQUAL
s	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
"\u003a"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
temp	TokenNameIdentifier
=	TokenNameEQUAL
s	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
index	TokenNameIdentifier
+	TokenNamePLUS
6	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
s	TokenNameIdentifier
=	TokenNameEQUAL
s	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
index	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
":"	TokenNameStringLiteral
+	TokenNamePLUS
temp	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
s	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
