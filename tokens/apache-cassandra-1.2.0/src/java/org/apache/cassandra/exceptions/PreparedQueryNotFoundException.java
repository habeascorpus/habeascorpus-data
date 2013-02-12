package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
exceptions	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
cql3	TokenNameIdentifier
.	TokenNameDOT
QueryProcessor	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
.	TokenNameDOT
MD5Digest	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
PreparedQueryNotFoundException	TokenNameIdentifier
extends	TokenNameextends
RequestValidationException	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
final	TokenNamefinal
MD5Digest	TokenNameIdentifier
id	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
PreparedQueryNotFoundException	TokenNameIdentifier
(	TokenNameLPAREN
MD5Digest	TokenNameIdentifier
id	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
ExceptionCode	TokenNameIdentifier
.	TokenNameDOT
UNPREPARED	TokenNameIdentifier
,	TokenNameCOMMA
makeMsg	TokenNameIdentifier
(	TokenNameLPAREN
id	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
id	TokenNameIdentifier
=	TokenNameEQUAL
id	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
String	TokenNameIdentifier
makeMsg	TokenNameIdentifier
(	TokenNameLPAREN
MD5Digest	TokenNameIdentifier
id	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
String	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
"Prepared query with ID %s not found"	TokenNameStringLiteral
+	TokenNamePLUS
" (either the query was not prepared on this host (maybe the host has been restarted?)"	TokenNameStringLiteral
+	TokenNamePLUS
" or you have prepared more than %d queries and query %s has been evicted from the internal cache)"	TokenNameStringLiteral
,	TokenNameCOMMA
id	TokenNameIdentifier
,	TokenNameCOMMA
QueryProcessor	TokenNameIdentifier
.	TokenNameDOT
MAX_CACHE_PREPARED	TokenNameIdentifier
,	TokenNameCOMMA
id	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE