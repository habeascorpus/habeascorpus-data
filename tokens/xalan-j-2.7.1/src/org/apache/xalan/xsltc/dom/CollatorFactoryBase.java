package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xalan	TokenNameIdentifier
.	TokenNameDOT
xsltc	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
.	TokenNameDOT
Collator	TokenNameIdentifier
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
xalan	TokenNameIdentifier
.	TokenNameDOT
xsltc	TokenNameIdentifier
.	TokenNameDOT
CollatorFactory	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
CollatorFactoryBase	TokenNameIdentifier
implements	TokenNameimplements
CollatorFactory	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
Locale	TokenNameIdentifier
DEFAULT_LOCALE	TokenNameIdentifier
=	TokenNameEQUAL
Locale	TokenNameIdentifier
.	TokenNameDOT
getDefault	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
Collator	TokenNameIdentifier
DEFAULT_COLLATOR	TokenNameIdentifier
=	TokenNameEQUAL
Collator	TokenNameIdentifier
.	TokenNameDOT
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
CollatorFactoryBase	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
Collator	TokenNameIdentifier
getCollator	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
lang	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
country	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
Collator	TokenNameIdentifier
.	TokenNameDOT
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Locale	TokenNameIdentifier
(	TokenNameLPAREN
lang	TokenNameIdentifier
,	TokenNameCOMMA
country	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Collator	TokenNameIdentifier
getCollator	TokenNameIdentifier
(	TokenNameLPAREN
Locale	TokenNameIdentifier
locale	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
locale	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
DEFAULT_LOCALE	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
DEFAULT_COLLATOR	TokenNameIdentifier
;	TokenNameSEMICOLON
else	TokenNameelse
return	TokenNamereturn
Collator	TokenNameIdentifier
.	TokenNameDOT
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
locale	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE