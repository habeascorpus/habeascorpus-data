package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
serialize	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
OutputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
Writer	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
XHTMLSerializer	TokenNameIdentifier
extends	TokenNameextends
HTMLSerializer	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
XHTMLSerializer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
new	TokenNamenew
OutputFormat	TokenNameIdentifier
(	TokenNameLPAREN
Method	TokenNameIdentifier
.	TokenNameDOT
XHTML	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
XHTMLSerializer	TokenNameIdentifier
(	TokenNameLPAREN
OutputFormat	TokenNameIdentifier
format	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
format	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
format	TokenNameIdentifier
:	TokenNameCOLON
new	TokenNamenew
OutputFormat	TokenNameIdentifier
(	TokenNameLPAREN
Method	TokenNameIdentifier
.	TokenNameDOT
XHTML	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
XHTMLSerializer	TokenNameIdentifier
(	TokenNameLPAREN
Writer	TokenNameIdentifier
writer	TokenNameIdentifier
,	TokenNameCOMMA
OutputFormat	TokenNameIdentifier
format	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
format	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
format	TokenNameIdentifier
:	TokenNameCOLON
new	TokenNamenew
OutputFormat	TokenNameIdentifier
(	TokenNameLPAREN
Method	TokenNameIdentifier
.	TokenNameDOT
XHTML	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setOutputCharStream	TokenNameIdentifier
(	TokenNameLPAREN
writer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
XHTMLSerializer	TokenNameIdentifier
(	TokenNameLPAREN
OutputStream	TokenNameIdentifier
output	TokenNameIdentifier
,	TokenNameCOMMA
OutputFormat	TokenNameIdentifier
format	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
true	TokenNametrue
,	TokenNameCOMMA
format	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
format	TokenNameIdentifier
:	TokenNameCOLON
new	TokenNamenew
OutputFormat	TokenNameIdentifier
(	TokenNameLPAREN
Method	TokenNameIdentifier
.	TokenNameDOT
XHTML	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setOutputByteStream	TokenNameIdentifier
(	TokenNameLPAREN
output	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setOutputFormat	TokenNameIdentifier
(	TokenNameLPAREN
OutputFormat	TokenNameIdentifier
format	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
setOutputFormat	TokenNameIdentifier
(	TokenNameLPAREN
format	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
format	TokenNameIdentifier
:	TokenNameCOLON
new	TokenNamenew
OutputFormat	TokenNameIdentifier
(	TokenNameLPAREN
Method	TokenNameIdentifier
.	TokenNameDOT
XHTML	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
,	TokenNameCOMMA
false	TokenNamefalse
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
