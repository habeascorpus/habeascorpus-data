package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
dtm	TokenNameIdentifier
.	TokenNameDOT
ref	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
ContentHandler	TokenNameIdentifier
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
public	TokenNamepublic
interface	TokenNameinterface
IncrementalSAXSource	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
setContentHandler	TokenNameIdentifier
(	TokenNameLPAREN
ContentHandler	TokenNameIdentifier
handler	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
setLexicalHandler	TokenNameIdentifier
(	TokenNameLPAREN
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
ext	TokenNameIdentifier
.	TokenNameDOT
LexicalHandler	TokenNameIdentifier
handler	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
setDTDHandler	TokenNameIdentifier
(	TokenNameLPAREN
org	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
sax	TokenNameIdentifier
.	TokenNameDOT
DTDHandler	TokenNameIdentifier
handler	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
Object	TokenNameIdentifier
deliverMoreNodes	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
parsemore	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
startParse	TokenNameIdentifier
(	TokenNameLPAREN
InputSource	TokenNameIdentifier
source	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
SAXException	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE