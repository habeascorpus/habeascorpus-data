package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
project	TokenNameIdentifier
.	TokenNameDOT
harness	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Locale	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
commons	TokenNameIdentifier
.	TokenNameDOT
jxpath	TokenNameIdentifier
.	TokenNameDOT
ri	TokenNameIdentifier
.	TokenNameDOT
QName	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
commons	TokenNameIdentifier
.	TokenNameDOT
jxpath	TokenNameIdentifier
.	TokenNameDOT
ri	TokenNameIdentifier
.	TokenNameDOT
model	TokenNameIdentifier
.	TokenNameDOT
NodePointer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
commons	TokenNameIdentifier
.	TokenNameDOT
jxpath	TokenNameIdentifier
.	TokenNameDOT
ri	TokenNameIdentifier
.	TokenNameDOT
model	TokenNameIdentifier
.	TokenNameDOT
NodePointerFactory	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
codehaus	TokenNameIdentifier
.	TokenNameDOT
plexus	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
Xpp3Dom	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
Xpp3DomPointerFactory	TokenNameIdentifier
implements	TokenNameimplements
NodePointerFactory	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
int	TokenNameint
getOrder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
200	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
NodePointer	TokenNameIdentifier
createNodePointer	TokenNameIdentifier
(	TokenNameLPAREN
QName	TokenNameIdentifier
name	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
object	TokenNameIdentifier
,	TokenNameCOMMA
Locale	TokenNameIdentifier
locale	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
object	TokenNameIdentifier
instanceof	TokenNameinstanceof
Xpp3Dom	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
Xpp3DomNodePointer	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
Xpp3Dom	TokenNameIdentifier
)	TokenNameRPAREN
object	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
NodePointer	TokenNameIdentifier
createNodePointer	TokenNameIdentifier
(	TokenNameLPAREN
NodePointer	TokenNameIdentifier
parent	TokenNameIdentifier
,	TokenNameCOMMA
QName	TokenNameIdentifier
name	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
object	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
object	TokenNameIdentifier
instanceof	TokenNameinstanceof
Xpp3Dom	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
Xpp3DomNodePointer	TokenNameIdentifier
(	TokenNameLPAREN
parent	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
Xpp3Dom	TokenNameIdentifier
)	TokenNameRPAREN
object	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE