package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
nio	TokenNameIdentifier
.	TokenNameDOT
ByteBuffer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
.	TokenNameDOT
filter	TokenNameIdentifier
.	TokenNameDOT
*	TokenNameMULTIPLY
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
thrift	TokenNameIdentifier
.	TokenNameDOT
ColumnParent	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
slf4j	TokenNameIdentifier
.	TokenNameDOT
Logger	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
slf4j	TokenNameIdentifier
.	TokenNameDOT
LoggerFactory	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
RetriedSliceFromReadCommand	TokenNameIdentifier
extends	TokenNameextends
SliceFromReadCommand	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
final	TokenNamefinal
Logger	TokenNameIdentifier
logger	TokenNameIdentifier
=	TokenNameEQUAL
LoggerFactory	TokenNameIdentifier
.	TokenNameDOT
getLogger	TokenNameIdentifier
(	TokenNameLPAREN
RetriedSliceFromReadCommand	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
int	TokenNameint
originalCount	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
RetriedSliceFromReadCommand	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
table	TokenNameIdentifier
,	TokenNameCOMMA
ByteBuffer	TokenNameIdentifier
key	TokenNameIdentifier
,	TokenNameCOMMA
ColumnParent	TokenNameIdentifier
column_parent	TokenNameIdentifier
,	TokenNameCOMMA
SliceQueryFilter	TokenNameIdentifier
filter	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
originalCount	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
table	TokenNameIdentifier
,	TokenNameCOMMA
key	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
QueryPath	TokenNameIdentifier
(	TokenNameLPAREN
column_parent	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
originalCount	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
RetriedSliceFromReadCommand	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
table	TokenNameIdentifier
,	TokenNameCOMMA
ByteBuffer	TokenNameIdentifier
key	TokenNameIdentifier
,	TokenNameCOMMA
QueryPath	TokenNameIdentifier
path	TokenNameIdentifier
,	TokenNameCOMMA
SliceQueryFilter	TokenNameIdentifier
filter	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
originalCount	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
table	TokenNameIdentifier
,	TokenNameCOMMA
key	TokenNameIdentifier
,	TokenNameCOMMA
path	TokenNameIdentifier
,	TokenNameCOMMA
filter	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
originalCount	TokenNameIdentifier
=	TokenNameEQUAL
originalCount	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
ReadCommand	TokenNameIdentifier
copy	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
ReadCommand	TokenNameIdentifier
readCommand	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
RetriedSliceFromReadCommand	TokenNameIdentifier
(	TokenNameLPAREN
table	TokenNameIdentifier
,	TokenNameCOMMA
key	TokenNameIdentifier
,	TokenNameCOMMA
queryPath	TokenNameIdentifier
,	TokenNameCOMMA
filter	TokenNameIdentifier
,	TokenNameCOMMA
originalCount	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
readCommand	TokenNameIdentifier
.	TokenNameDOT
setDigestQuery	TokenNameIdentifier
(	TokenNameLPAREN
isDigestQuery	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
readCommand	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
int	TokenNameint
getOriginalRequestedCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
originalCount	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
"RetriedSliceFromReadCommand("	TokenNameStringLiteral
+	TokenNamePLUS
"cmd="	TokenNameStringLiteral
+	TokenNamePLUS
super	TokenNamesuper
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
", originalCount="	TokenNameStringLiteral
+	TokenNamePLUS
originalCount	TokenNameIdentifier
+	TokenNamePLUS
")"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE