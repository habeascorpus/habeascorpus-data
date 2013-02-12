package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
types	TokenNameIdentifier
.	TokenNameDOT
resolver	TokenNameIdentifier
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
net	TokenNameIdentifier
.	TokenNameDOT
MalformedURLException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
net	TokenNameIdentifier
.	TokenNameDOT
URL	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
BuildException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
types	TokenNameIdentifier
.	TokenNameDOT
XMLCatalog	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
types	TokenNameIdentifier
.	TokenNameDOT
ResourceLocation	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
resolver	TokenNameIdentifier
.	TokenNameDOT
Catalog	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
resolver	TokenNameIdentifier
.	TokenNameDOT
CatalogManager	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
resolver	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
CatalogResolver	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
ApacheCatalogResolver	TokenNameIdentifier
extends	TokenNameextends
CatalogResolver	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
XMLCatalog	TokenNameIdentifier
xmlCatalog	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
static	TokenNamestatic
{	TokenNameLBRACE
CatalogManager	TokenNameIdentifier
.	TokenNameDOT
getStaticManager	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setIgnoreMissingProperties	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
getProperties	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
"xml.catalog.className"	TokenNameStringLiteral
,	TokenNameCOMMA
ApacheCatalog	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
CatalogManager	TokenNameIdentifier
.	TokenNameDOT
getStaticManager	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setUseStaticCatalog	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setXMLCatalog	TokenNameIdentifier
(	TokenNameLPAREN
XMLCatalog	TokenNameIdentifier
xmlCatalog	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
xmlCatalog	TokenNameIdentifier
=	TokenNameEQUAL
xmlCatalog	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
parseCatalog	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
file	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Catalog	TokenNameIdentifier
catalog	TokenNameIdentifier
=	TokenNameEQUAL
getCatalog	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
(	TokenNameLPAREN
catalog	TokenNameIdentifier
instanceof	TokenNameinstanceof
ApacheCatalog	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
"Wrong catalog type found: "	TokenNameStringLiteral
+	TokenNamePLUS
catalog	TokenNameIdentifier
.	TokenNameDOT
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
ApacheCatalog	TokenNameIdentifier
apacheCatalog	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
ApacheCatalog	TokenNameIdentifier
)	TokenNameRPAREN
catalog	TokenNameIdentifier
;	TokenNameSEMICOLON
apacheCatalog	TokenNameIdentifier
.	TokenNameDOT
setResolver	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
apacheCatalog	TokenNameIdentifier
.	TokenNameDOT
parseCatalog	TokenNameIdentifier
(	TokenNameLPAREN
file	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
MalformedURLException	TokenNameIdentifier
ex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
ex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
ex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
ex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
addPublicEntry	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
publicid	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
systemid	TokenNameIdentifier
,	TokenNameCOMMA
URL	TokenNameIdentifier
base	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ResourceLocation	TokenNameIdentifier
dtd	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ResourceLocation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
dtd	TokenNameIdentifier
.	TokenNameDOT
setBase	TokenNameIdentifier
(	TokenNameLPAREN
base	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
dtd	TokenNameIdentifier
.	TokenNameDOT
setPublicId	TokenNameIdentifier
(	TokenNameLPAREN
publicid	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
dtd	TokenNameIdentifier
.	TokenNameDOT
setLocation	TokenNameIdentifier
(	TokenNameLPAREN
systemid	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
xmlCatalog	TokenNameIdentifier
.	TokenNameDOT
addDTD	TokenNameIdentifier
(	TokenNameLPAREN
dtd	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
addURIEntry	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
uri	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
altURI	TokenNameIdentifier
,	TokenNameCOMMA
URL	TokenNameIdentifier
base	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ResourceLocation	TokenNameIdentifier
entity	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ResourceLocation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
entity	TokenNameIdentifier
.	TokenNameDOT
setBase	TokenNameIdentifier
(	TokenNameLPAREN
base	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
entity	TokenNameIdentifier
.	TokenNameDOT
setPublicId	TokenNameIdentifier
(	TokenNameLPAREN
uri	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
entity	TokenNameIdentifier
.	TokenNameDOT
setLocation	TokenNameIdentifier
(	TokenNameLPAREN
altURI	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
xmlCatalog	TokenNameIdentifier
.	TokenNameDOT
addEntity	TokenNameIdentifier
(	TokenNameLPAREN
entity	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE