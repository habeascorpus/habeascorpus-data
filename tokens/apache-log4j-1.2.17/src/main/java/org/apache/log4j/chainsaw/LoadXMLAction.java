package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
chainsaw	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
event	TokenNameIdentifier
.	TokenNameDOT
ActionEvent	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
File	TokenNameIdentifier
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
StringReader	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
swing	TokenNameIdentifier
.	TokenNameDOT
AbstractAction	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
swing	TokenNameIdentifier
.	TokenNameDOT
JFileChooser	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
swing	TokenNameIdentifier
.	TokenNameDOT
JFrame	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
swing	TokenNameIdentifier
.	TokenNameDOT
JOptionPane	TokenNameIdentifier
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
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
Logger	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
InputSource	TokenNameIdentifier
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
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
XMLReader	TokenNameIdentifier
;	TokenNameSEMICOLON
class	TokenNameclass
LoadXMLAction	TokenNameIdentifier
extends	TokenNameextends
AbstractAction	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
Logger	TokenNameIdentifier
LOG	TokenNameIdentifier
=	TokenNameEQUAL
Logger	TokenNameIdentifier
.	TokenNameDOT
getLogger	TokenNameIdentifier
(	TokenNameLPAREN
LoadXMLAction	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
JFrame	TokenNameIdentifier
mParent	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
JFileChooser	TokenNameIdentifier
mChooser	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
JFileChooser	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
{	TokenNameLBRACE
mChooser	TokenNameIdentifier
.	TokenNameDOT
setMultiSelectionEnabled	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
mChooser	TokenNameIdentifier
.	TokenNameDOT
setFileSelectionMode	TokenNameIdentifier
(	TokenNameLPAREN
JFileChooser	TokenNameIdentifier
.	TokenNameDOT
FILES_ONLY	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
final	TokenNamefinal
XMLReader	TokenNameIdentifier
mParser	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
XMLFileHandler	TokenNameIdentifier
mHandler	TokenNameIdentifier
;	TokenNameSEMICOLON
LoadXMLAction	TokenNameIdentifier
(	TokenNameLPAREN
JFrame	TokenNameIdentifier
aParent	TokenNameIdentifier
,	TokenNameCOMMA
MyTableModel	TokenNameIdentifier
aModel	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
SAXException	TokenNameIdentifier
,	TokenNameCOMMA
ParserConfigurationException	TokenNameIdentifier
{	TokenNameLBRACE
mParent	TokenNameIdentifier
=	TokenNameEQUAL
aParent	TokenNameIdentifier
;	TokenNameSEMICOLON
mHandler	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
XMLFileHandler	TokenNameIdentifier
(	TokenNameLPAREN
aModel	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
mParser	TokenNameIdentifier
=	TokenNameEQUAL
SAXParserFactory	TokenNameIdentifier
.	TokenNameDOT
newInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
newSAXParser	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getXMLReader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
mParser	TokenNameIdentifier
.	TokenNameDOT
setContentHandler	TokenNameIdentifier
(	TokenNameLPAREN
mHandler	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
actionPerformed	TokenNameIdentifier
(	TokenNameLPAREN
ActionEvent	TokenNameIdentifier
aIgnore	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
LOG	TokenNameIdentifier
.	TokenNameDOT
info	TokenNameIdentifier
(	TokenNameLPAREN
"load file called"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
mChooser	TokenNameIdentifier
.	TokenNameDOT
showOpenDialog	TokenNameIdentifier
(	TokenNameLPAREN
mParent	TokenNameIdentifier
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
JFileChooser	TokenNameIdentifier
.	TokenNameDOT
APPROVE_OPTION	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
LOG	TokenNameIdentifier
.	TokenNameDOT
info	TokenNameIdentifier
(	TokenNameLPAREN
"Need to load a file"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
File	TokenNameIdentifier
chosen	TokenNameIdentifier
=	TokenNameEQUAL
mChooser	TokenNameIdentifier
.	TokenNameDOT
getSelectedFile	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
LOG	TokenNameIdentifier
.	TokenNameDOT
info	TokenNameIdentifier
(	TokenNameLPAREN
"loading the contents of "	TokenNameStringLiteral
+	TokenNamePLUS
chosen	TokenNameIdentifier
.	TokenNameDOT
getAbsolutePath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
final	TokenNamefinal
int	TokenNameint
num	TokenNameIdentifier
=	TokenNameEQUAL
loadFile	TokenNameIdentifier
(	TokenNameLPAREN
chosen	TokenNameIdentifier
.	TokenNameDOT
getAbsolutePath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
JOptionPane	TokenNameIdentifier
.	TokenNameDOT
showMessageDialog	TokenNameIdentifier
(	TokenNameLPAREN
mParent	TokenNameIdentifier
,	TokenNameCOMMA
"Loaded "	TokenNameStringLiteral
+	TokenNamePLUS
num	TokenNameIdentifier
+	TokenNamePLUS
" events."	TokenNameStringLiteral
,	TokenNameCOMMA
"CHAINSAW"	TokenNameStringLiteral
,	TokenNameCOMMA
JOptionPane	TokenNameIdentifier
.	TokenNameDOT
INFORMATION_MESSAGE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
LOG	TokenNameIdentifier
.	TokenNameDOT
warn	TokenNameIdentifier
(	TokenNameLPAREN
"caught an exception loading the file"	TokenNameStringLiteral
,	TokenNameCOMMA
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
JOptionPane	TokenNameIdentifier
.	TokenNameDOT
showMessageDialog	TokenNameIdentifier
(	TokenNameLPAREN
mParent	TokenNameIdentifier
,	TokenNameCOMMA
"Error parsing file - "	TokenNameStringLiteral
+	TokenNamePLUS
e	TokenNameIdentifier
.	TokenNameDOT
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
"CHAINSAW"	TokenNameStringLiteral
,	TokenNameCOMMA
JOptionPane	TokenNameIdentifier
.	TokenNameDOT
ERROR_MESSAGE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
int	TokenNameint
loadFile	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
aFile	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
SAXException	TokenNameIdentifier
,	TokenNameCOMMA
IOException	TokenNameIdentifier
{	TokenNameLBRACE
synchronized	TokenNamesynchronized
(	TokenNameLPAREN
mParser	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
StringBuffer	TokenNameIdentifier
buf	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"<?xml version="1.0" standalone="yes"?> "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"<!DOCTYPE log4j:eventSet "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"[<!ENTITY data SYSTEM "file:///"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
aFile	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"">]> "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"<log4j:eventSet xmlns:log4j="Claira"> "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"&data; "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"</log4j:eventSet> "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
InputSource	TokenNameIdentifier
is	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
InputSource	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
StringReader	TokenNameIdentifier
(	TokenNameLPAREN
buf	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
mParser	TokenNameIdentifier
.	TokenNameDOT
parse	TokenNameIdentifier
(	TokenNameLPAREN
is	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
mHandler	TokenNameIdentifier
.	TokenNameDOT
getNumEvents	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
