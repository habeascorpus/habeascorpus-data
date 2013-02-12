package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
queryParser	TokenNameIdentifier
.	TokenNameDOT
ext	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
analysis	TokenNameIdentifier
.	TokenNameDOT
Analyzer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
queryParser	TokenNameIdentifier
.	TokenNameDOT
ParseException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
queryParser	TokenNameIdentifier
.	TokenNameDOT
QueryParser	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
queryParser	TokenNameIdentifier
.	TokenNameDOT
ext	TokenNameIdentifier
.	TokenNameDOT
Extensions	TokenNameIdentifier
.	TokenNameDOT
Pair	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
.	TokenNameDOT
Query	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Version	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
ExtendableQueryParser	TokenNameIdentifier
extends	TokenNameextends
QueryParser	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
final	TokenNamefinal
String	TokenNameIdentifier
defaultField	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
Extensions	TokenNameIdentifier
extensions	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
Extensions	TokenNameIdentifier
DEFAULT_EXTENSION	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Extensions	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
ExtendableQueryParser	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
Version	TokenNameIdentifier
matchVersion	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
String	TokenNameIdentifier
f	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
Analyzer	TokenNameIdentifier
a	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
matchVersion	TokenNameIdentifier
,	TokenNameCOMMA
f	TokenNameIdentifier
,	TokenNameCOMMA
a	TokenNameIdentifier
,	TokenNameCOMMA
DEFAULT_EXTENSION	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ExtendableQueryParser	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
Version	TokenNameIdentifier
matchVersion	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
String	TokenNameIdentifier
f	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
Analyzer	TokenNameIdentifier
a	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
Extensions	TokenNameIdentifier
ext	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
matchVersion	TokenNameIdentifier
,	TokenNameCOMMA
f	TokenNameIdentifier
,	TokenNameCOMMA
a	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
defaultField	TokenNameIdentifier
=	TokenNameEQUAL
f	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
extensions	TokenNameIdentifier
=	TokenNameEQUAL
ext	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
char	TokenNamechar
getExtensionFieldDelimiter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
extensions	TokenNameIdentifier
.	TokenNameDOT
getExtensionFieldDelimiter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
protected	TokenNameprotected
Query	TokenNameIdentifier
getFieldQuery	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
String	TokenNameIdentifier
field	TokenNameIdentifier
,	TokenNameCOMMA
final	TokenNamefinal
String	TokenNameIdentifier
queryText	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
quoted	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
ParseException	TokenNameIdentifier
{	TokenNameLBRACE
final	TokenNamefinal
Pair	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
>	TokenNameGREATER
splitExtensionField	TokenNameIdentifier
=	TokenNameEQUAL
this	TokenNamethis
.	TokenNameDOT
extensions	TokenNameIdentifier
.	TokenNameDOT
splitExtensionField	TokenNameIdentifier
(	TokenNameLPAREN
defaultField	TokenNameIdentifier
,	TokenNameCOMMA
field	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
ParserExtension	TokenNameIdentifier
extension	TokenNameIdentifier
=	TokenNameEQUAL
this	TokenNamethis
.	TokenNameDOT
extensions	TokenNameIdentifier
.	TokenNameDOT
getExtension	TokenNameIdentifier
(	TokenNameLPAREN
splitExtensionField	TokenNameIdentifier
.	TokenNameDOT
cud	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
extension	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
extension	TokenNameIdentifier
.	TokenNameDOT
parse	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
ExtensionQuery	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
,	TokenNameCOMMA
splitExtensionField	TokenNameIdentifier
.	TokenNameDOT
cur	TokenNameIdentifier
,	TokenNameCOMMA
queryText	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
super	TokenNamesuper
.	TokenNameDOT
getFieldQuery	TokenNameIdentifier
(	TokenNameLPAREN
field	TokenNameIdentifier
,	TokenNameCOMMA
queryText	TokenNameIdentifier
,	TokenNameCOMMA
quoted	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
