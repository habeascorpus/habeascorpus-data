package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
batik	TokenNameIdentifier
.	TokenNameDOT
css	TokenNameIdentifier
.	TokenNameDOT
engine	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
Attr	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
Element	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
Node	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
interface	TokenNameinterface
CSSNavigableDocumentListener	TokenNameIdentifier
{	TokenNameLBRACE
void	TokenNamevoid
nodeInserted	TokenNameIdentifier
(	TokenNameLPAREN
Node	TokenNameIdentifier
newNode	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
void	TokenNamevoid
nodeToBeRemoved	TokenNameIdentifier
(	TokenNameLPAREN
Node	TokenNameIdentifier
oldNode	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
void	TokenNamevoid
subtreeModified	TokenNameIdentifier
(	TokenNameLPAREN
Node	TokenNameIdentifier
rootOfModifications	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
void	TokenNamevoid
characterDataModified	TokenNameIdentifier
(	TokenNameLPAREN
Node	TokenNameIdentifier
text	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
void	TokenNamevoid
attrModified	TokenNameIdentifier
(	TokenNameLPAREN
Element	TokenNameIdentifier
e	TokenNameIdentifier
,	TokenNameCOMMA
Attr	TokenNameIdentifier
attr	TokenNameIdentifier
,	TokenNameCOMMA
short	TokenNameshort
attrChange	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
prevValue	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
newValue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
void	TokenNamevoid
overrideStyleTextChanged	TokenNameIdentifier
(	TokenNameLPAREN
CSSStylableElement	TokenNameIdentifier
e	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
text	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
void	TokenNamevoid
overrideStylePropertyRemoved	TokenNameIdentifier
(	TokenNameLPAREN
CSSStylableElement	TokenNameIdentifier
e	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
void	TokenNamevoid
overrideStylePropertyChanged	TokenNameIdentifier
(	TokenNameLPAREN
CSSStylableElement	TokenNameIdentifier
e	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
name	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
val	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
prio	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE