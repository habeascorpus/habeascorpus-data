package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
xinclude	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
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
XML11Char	TokenNameIdentifier
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
parser	TokenNameIdentifier
.	TokenNameDOT
XMLInputSource	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
XInclude11TextReader	TokenNameIdentifier
extends	TokenNameextends
XIncludeTextReader	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
XInclude11TextReader	TokenNameIdentifier
(	TokenNameLPAREN
XMLInputSource	TokenNameIdentifier
source	TokenNameIdentifier
,	TokenNameCOMMA
XIncludeHandler	TokenNameIdentifier
handler	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
bufferSize	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
source	TokenNameIdentifier
,	TokenNameCOMMA
handler	TokenNameIdentifier
,	TokenNameCOMMA
bufferSize	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
boolean	TokenNameboolean
isValid	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
ch	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
XML11Char	TokenNameIdentifier
.	TokenNameDOT
isXML11Valid	TokenNameIdentifier
(	TokenNameLPAREN
ch	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
